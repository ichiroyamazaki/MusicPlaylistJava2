package com.mycompany.musicplaylists;

import java.util.LinkedList;
public class MusicPlaylist	{
public static void main(String[] args){

	LinkedList<String> songs = new LinkedList<>();
	LinkedList<String> artists = new LinkedList<>();
	LinkedList<String> playlist = new LinkedList<>();

		songs.add("another love");
		songs.add("daylight");
		songs.add("fairy tale");
		songs.add("happier than ever");
		songs.add("memories");

		artists.add("Tom Odell");
		artists.add("David Kushner");
		artists.add("Alexnder Rybak");
		artists.add("Billie Eilish");
		artists.add("Conan Gray");

		for(int i=0;i<songs.size();i++)
			playlist.add(songs.get(i) + " - " + artists.get(i));

		System.out.println(songs);
		System.out.println(artists);
		for(String s: playlist)
		System.out.println(s);
	}
}