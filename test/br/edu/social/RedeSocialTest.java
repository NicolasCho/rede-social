package br.edu.social;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class RedeSocialTest {
	private Usuario usuario;
	private Produto produto;
	
	@BeforeEach
	public void setUp() {
		usuario = new Usuario("Pedro");
		produto = new Produto("Sofá", 310.50);
	}
	
	@Test
	public void test1() {
		Video video = new Video(15, usuario, produto);
		video.adicionaAvaliacao(usuario, 0);
		video.adicionaAvaliacao(usuario, 10);
		
		assertEquals(0,video.mediaAvaliacoes());
	}
	
	@Test
	public void test2() {
		Video video = new Video(15, usuario, produto);
		Usuario usuario2 = new Usuario("Marcos");
		
		video.adicionaAvaliacao(usuario2, 3);
		
		assertEquals(3,video.mediaAvaliacoes());
	}
	
	@Test
	public void test3() {
		Video video = new Video(15, usuario, produto);
		Usuario usuario2 = new Usuario("Marcos");
		Usuario usuario3 = new Usuario("Otavio");
		video.adicionaAvaliacao(usuario2, 1);
		video.adicionaAvaliacao(usuario3, 4);
		
		assertEquals(3, video.mediaAvaliacoes());
	}
	
	@Test
	public void test4() {
		Video video = new Video(15, usuario, produto);
		Usuario usuario2 = new Usuario("Marcos");
		Usuario usuario3 = new Usuario("Otavio");
		Usuario usuario4 = new Usuario("Pereira");
		video.adicionaAvaliacao(usuario2, 1);
		video.adicionaAvaliacao(usuario3, 2);
		video.adicionaAvaliacao(usuario4, 4);
		
		assertEquals(2, video.mediaAvaliacoes());
	}
	
	@Test
	public void test5() {
		Video video = new Video(15, usuario, produto);
		Video video2 = new Video(16, usuario, produto);
		Usuario usuario2 = new Usuario("Marcos");
		Usuario usuario3 = new Usuario("Otavio");
		Usuario usuario4 = new Usuario("Pereira");
		video.adicionaAvaliacao(usuario2, 1);
		video.adicionaAvaliacao(usuario3, 2);
		
		video2.adicionaAvaliacao(usuario4, 4);
		
		assertEquals(6, video.mediaAvaliacoes()+video2.mediaAvaliacoes());
	}
	
}
