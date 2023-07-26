package com.manav;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.Pipe;

public class Main {
    public static void main(String[] args) {
        try{
            Pipe pipe = Pipe.open();
            Runnable writer = new Runnable() {
                @Override
                public void run() {
                    try{
                        Pipe.SinkChannel sinkChannel = pipe.sink();
                        ByteBuffer buffer = ByteBuffer.allocate(56);
                        for(int i = 0; i < 10; i++){
                            String currentTime = "The time is : " + System.currentTimeMillis();
                            buffer.put(currentTime.getBytes());
                            buffer.flip();
                            while(buffer.hasRemaining()){
                                sinkChannel.write(buffer);
                            }
                            buffer.flip();
                            Thread.sleep(100);
                        }
                    }
                    catch(Exception e){
                        e.printStackTrace();
                    }
                }
            };

            Runnable reader = new Runnable() {
                @Override
                public void run() {
                    try{
                        Pipe.SourceChannel sourceChannel = pipe.source();
                        ByteBuffer buffer = ByteBuffer.allocate(56);
                        for(int i = 0; i < 10; i++){
                            int bytesRead = sourceChannel.read(buffer);
                            byte[] timeString = new byte[bytesRead];
                            buffer.flip();
                            buffer.get(timeString);
                            System.out.println("Reader Thread: " + new String(timeString));
                            buffer.flip();
                            Thread.sleep(100);
                        }
                    }
                    catch(Exception e){
                        e.printStackTrace();
                    }
                }
            };

            new Thread(writer).start();
            new Thread(reader).start();

        }
        catch(IOException e){
            e.printStackTrace();
        }
//        try(FileOutputStream binFile = new FileOutputStream("data.dat");
//            FileChannel binChannel = binFile.getChannel()){
//
////            byte[] outputBytes = "Hello World!".getBytes();
////            byte[] outputBytes2 = "Nice to meet you".getBytes();
////            buffer.put(outputBytes).putInt(245).putInt(-98765).put(outputBytes2).putInt(1000);
////            buffer.flip();
//
////            read(ByteBuffer) - reads bytes beginning at the channel's position, and after the read, updates the position accordingly.
////                                Note that now we are talking about the channel's position, not the byte buffer's position.
////                                Of course, the bytes will be places into the buffer starting at its current position.
////            write(ByteBuffer) - the same as read, except it writes. There's one exception.
////                                If a datasource is opened in APPEND mode, then the first write will take place starting
////                                at the end of the datasource, rather than at position 0. After the write, the position will be updated accordingly.
////            position() - returns the channel's position.
////            position(long) - sets the channel's position to the passed value.
////            truncate(long) - truncates the size of the attached datasource to the passed value.
////            size() - returns the size of the attached datasource.
//
//            ByteBuffer buffer = ByteBuffer.allocate(100);
//            byte[] outputBytes = "Hello World!".getBytes();
//            buffer.put(outputBytes);
//            long int1Pos = outputBytes.length;
//            buffer.putInt(245);
//            long int2Pos = int1Pos + Integer.BYTES;
//            buffer.putInt(-98765);
//            byte[] outputBytes2 = "Nice to meet you".getBytes();
//            buffer.put(outputBytes2);
//            long int3Pos = int2Pos + Integer.BYTES + outputBytes2.length;
//            buffer.putInt(1000);
//            buffer.flip();
//
//            binChannel.write(buffer);
//            RandomAccessFile ra = new RandomAccessFile("data.dat", "rwd");
//            FileChannel channel = ra.getChannel();
//            ByteBuffer readBuffer = ByteBuffer.allocate(Integer.BYTES);
//            channel.position(int3Pos);
//            channel.read(readBuffer);
//            readBuffer.flip();
//            System.out.println("int3 = " + readBuffer.getInt());
//
//            readBuffer.flip();
//            channel.position(int2Pos);
//            channel.read(readBuffer);
//            readBuffer.flip();
//            System.out.println("int2 = " + readBuffer.getInt());
//
//            readBuffer.flip();
//            channel.position(int1Pos);
//            channel.read(readBuffer);
//            readBuffer.flip();
//            System.out.println("int1 = " + readBuffer.getInt());
//
//            RandomAccessFile copyFile = new RandomAccessFile("datacopy.dat", "rw");
//            FileChannel copyChannel = copyFile.getChannel();
//            channel.position(0);
////            long numTransferred = copyChannel.transferFrom(channel,0, channel.size());
//            long numTransferred = channel.transferTo(0, channel.size(), copyChannel);
//            System.out.println("Num transferred = " + numTransferred);
//            channel.close();
//            ra.close();
//            copyChannel.close();
//
////            byte[] outputString = "Hello, World!".getBytes();
////            long str1Pos = 0;
////            long newInt1Pos = outputString.length;
////            long newInt2Pos = newInt1Pos + Integer.BYTES;
////            byte[] outputString2 = "Nice to meet you".getBytes();
////            long str2Pos = newInt2Pos + Integer.BYTES;
////            long newInt3Pos = str2Pos + outputString2.length;
////
////            ByteBuffer intBuffer = ByteBuffer.allocate(Integer.BYTES);
////            intBuffer.putInt(245);
////            intBuffer.flip();
////            binChannel.position(newInt1Pos);
////            binChannel.write(intBuffer);
////
////            intBuffer.flip();
////            intBuffer.putInt(-98765);
////            intBuffer.flip();
////            binChannel.position(newInt2Pos);
////            binChannel.write(intBuffer);
////
////            intBuffer.flip();
////            intBuffer.putInt(1000);
////            intBuffer.flip();
////            binChannel.position(newInt3Pos);
////            binChannel.write(intBuffer);
////
////            binChannel.position(str1Pos);
////            binChannel.write(ByteBuffer.wrap(outputString));
////            binChannel.position(str2Pos);
////            binChannel.write(ByteBuffer.wrap(outputString2));
//        }
//        catch(IOException e){
//            e.printStackTrace();
//        }
    }
}