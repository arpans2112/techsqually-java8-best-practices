package com.techsqually.LinkedListTest.LinkedListChallange1;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {

    private String artist;
    private String name;
    private ArrayList<Song> songs;

    public Album(String name ,String artist ) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<Song>();

    }


    public boolean  addSongs(String title , double duration){

     if (findSong(title)==null){
         this.songs.add(new Song(title,duration));
         return true;
     }else
         return false;
    }


    private Song findSong(String title){

        //ClassObject variable_name : array_list_reference
        for (Song checkedSong : this.songs){

            if (checkedSong.getTitile().equals(title)){
                return checkedSong;
            }
        }
        return null;

    }


    public boolean addToPlayList(int trackerNo, LinkedList<Song> playlist){

        int index = trackerNo -1;

        if (index > 0 && index <= this.songs.size() ){

            playlist.add(this.songs.get(index));
            return true;
        }

        System.out.println("This album doesn't have a track no : " + trackerNo);
        return false;
    }


    public boolean addToPlayList(String title, LinkedList<Song> playlist){

       Song checkedSong = findSong(title);
       if (checkedSong!=null){

           playlist.add(checkedSong);
           return true;
       }

        System.out.println("This song " + title + " is not in this album");
       return false;
    }
}
