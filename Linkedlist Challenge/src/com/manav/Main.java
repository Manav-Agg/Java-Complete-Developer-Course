package com.manav;

import java.util.*;

public class Main {
    private static ArrayList<Album> albums = new ArrayList<Album>();
    public static void main(String[] args) {
//	    Create a program that implements a playlist for songs.
//      Create a Song class having Title and Duration for the song.
//      The program will have an album class containing the list of songs.
//      The albums will be stored in an Arraylist.
//      Songs from different albums can be added to the playlist and will appear in the list in the order
//      they are added.
//      Once the songs have been added to the playlist, create a menu of options to:-
//      Quit, Skip forward to the next song, skip backwards to a previous song. Replay the current song.
//      List the songs in the playlist.
//      A song must exist on an album before it can be added to the playlist (so you can only play songs that
//      you own).
//      Hint: To replay a song, consider what happened when we went back and forth from a city before we
//      started tracking the direction we were going.
//      As an optional extra, provide an option to remove the current song from the playlist
//      (hint: listiterator.remove())

        Album album = new Album("Stormbringer", "Deep Purple");
        album.addSong("Stormbringer", 4.6);
        album.addSong("Love don't mean a thing", 4.22);
        album.addSong("Holy man", 4.3);
        album.addSong("Hold on", 5.6);
        album.addSong("Lady Double Dealer", 3.21);
        album.addSong("You can't do it right", 6.23);
        album.addSong("High Ball Shooter", 4.27);
        album.addSong("The gypsy", 4.2);
        album.addSong("Soldier of fortune", 3.13);
        albums.add(album);

        album = new Album("For those about to rock", "AC/DC");
        album.addSong("For those about to rock", 5.44);
        album.addSong("I put the finger on you", 3.25);
        album.addSong("Let's go", 3.45);
        album.addSong("Inject the venom", 3.33);
        album.addSong("Snowballed", 4.51);
        album.addSong("Evil walks", 3.45);
        album.addSong("C.O.D.", 5.25);
        album.addSong("Breaking the rules", 5.32);
        album.addSong("night of the long Knives", 5.12);
        albums.add(album);

        LinkedList<Song> playlist = new LinkedList<Song>();
        albums.get(0).addToPlaylist("You can't do it right", playlist);
        albums.get(0).addToPlaylist("Holy man", playlist);
        albums.get(0).addToPlaylist("Speed King", playlist); //Does not exist
        albums.get(0).addToPlaylist(9, playlist);
        albums.get(1).addToPlaylist(8, playlist);
        albums.get(1).addToPlaylist(3, playlist);
        albums.get(1).addToPlaylist(2, playlist);
        albums.get(1).addToPlaylist(24, playlist); //There is no track 24

        play(playlist);
    }

    private static void play(LinkedList<Song> playlist){
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean forward = true;
        ListIterator<Song> listIterator = playlist.listIterator();
        if(playlist.size() == 0){
            System.out.println("No songs in playlist");
            return;
        }
        else{
            System.out.println("Now playing " + listIterator.next().toString());
            printMenu();
        }
        while(!quit){
            int action = scanner.nextInt();
            scanner.nextLine();

            switch(action){
                case 0:
                    System.out.println("Playlist complete.");
                    quit = true;
                    break;

                case 1:
                    if (!forward){
                        if(listIterator.hasNext()){
                            listIterator.next();
                        }
                        forward = true;
                    }
                    if (listIterator.hasNext()){
                        System.out.println("Now playing " + listIterator.next().toString());
                    }
                    else{
                        System.out.println("We have reached the end of the playlist");
                        forward = false;
                    }
                    break;

                case 2:
                    if(forward){
                        if(listIterator.hasPrevious()){
                            listIterator.previous();
                        }
                        forward = false;
                    }
                    if(listIterator.hasPrevious()){
                        System.out.println("Now playing " + listIterator.previous().toString());
                    }
                    else{
                        System.out.println("We are at the start of the playlist");
                        forward = true;
                    }
                    break;

                case 3:
                    if(forward){
                        if(listIterator.hasPrevious()){
                            System.out.println("Now replaying " + listIterator.previous().toString());
                            forward = false;
                        }
                        else{
                            System.out.println("We are at the start of the list");
                        }
                    }
                    else{
                        if (listIterator.hasNext()) {
                            System.out.println("Now replaying " + listIterator.next().toString());
                            forward = true;
                        }
                        else{
                            System.out.println("We have reached the end of the list");
                        }
                    }
                    break;

                case 4:
                    printList(playlist);
                    break;

                case 5:
                    printMenu();
                    break;

                case 6:
                    if(playlist.size() > 0){
                        listIterator.remove();
                        if(listIterator.hasNext()){
                            System.out.println("Now playing " + listIterator.next());
                        }
                        else if(listIterator.hasPrevious()){
                            System.out.println("Now Playing " + listIterator.previous());
                        }
                    }
                    break;
            }
        }
    }

    private static void printMenu(){
        System.out.println("Available Actions:\nPress");
        System.out.println( "0 - to quit\n" +
                            "1 - to play next song\n" +
                            "2 - to play previous song\n" +
                            "3 - to play the current song\n" +
                            "4 - list songs in the playlist\n" +
                            "5 - print available actions\n" +
                            "6 - delete current song from playlist");
    }

    private static void printList(LinkedList<Song> playlist){
        Iterator<Song> iterator = playlist.iterator();
        System.out.println("=============================================");
        while(iterator.hasNext()){
            System.out.println(iterator.next().toString());
        }
        System.out.println("=============================================");
    }
}