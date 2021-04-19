package br.edu.social;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
	private String nome;
	private List<Video>videos;
	
	public Usuario(String nome) {
		this.nome = nome;
		this.videos = new ArrayList<>();
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public Video postaVideo(int identificador, Produto produto){
		Video video = new Video(identificador, this, produto);
		this.videos.add(video);
		return video;
	}
	
	public int totalAvaliacoes() {
		int soma = 0;
		for (Video video : this.videos) {
			soma += video.mediaAvaliacoes();
		}
		return soma;
	}
}
