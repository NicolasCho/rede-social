package br.edu.social;

import java.util.HashMap;
import java.util.Map;

public class Video {
	private int id;
	private Usuario usuario;
	private Produto produto;
	private Map<String, Integer>avaliacoes;
	
	public Video(int id, Usuario usuario, Produto produto) {
		this.id = id;
		this.usuario = usuario;
		this.produto = produto;
		this.avaliacoes = new HashMap<>();
	}
	
	public int getId() {
		return this.id;
	}
	
	public Produto getProduto() {
		return this.produto;
	}
	
	public void adicionaAvaliacao(Usuario usuario, int avaliacao) {
		if (usuario.getNome() != this.usuario.getNome()){
			if (avaliacao <= 5 && avaliacao >= 1) {
				this.avaliacoes.put(usuario.getNome(), avaliacao);
			}
		}
	}
	
	public int mediaAvaliacoes() {
		int soma = 0;
		for (int avaliacao : this.avaliacoes.values()) {
			soma += avaliacao;
		}
		int media = 0;
		int n = this.avaliacoes.size();
		if (n!=0) {
			media = (int)Math.round(soma/this.avaliacoes.size());
		}
		return media;
	}
	

}
