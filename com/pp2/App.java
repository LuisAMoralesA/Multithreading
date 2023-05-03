package com.pp2;

class Runner1 implements Runnable{
	@Override
	public void run(){
		for(int i=0; i<10;i++) {
			System.out.println("Runner 1: " + i);
		}
	}
}

class Runner2 implements Runnable{
	@Override
	public void run(){
		for(int i=0; i<10;i++) {
			System.out.println("Runner 2: " + i);
		}
	}
}

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1 = new Thread(new Runner1());
		Thread t2 = new Thread(new Runner2());
		t1.start();
		t2.start();
	}

	/*Cada nucleo empieza a realizar una accion
	Los procesadores se dividen en Nucleos. Dividen las tareas
	Cada nucleo hace un proceso de Runner (Threads o hilos)
	
	Neural Engine liberan a la CPU de trabajo, GPU hace el procesador
	Pantalla es un dispositivo de salida. Mouse y teclado son dispositivos de entrada
	Buses son COLECCION DE cables o alambres paralelos.
	Los puertos de conexion son buses externos
	Los niveles de Cache son los niveles de registro
	ALU unidad de aritmetica y logica (Hace operaciones)
	Entre mas nucleos, mas operaciones se pueden hacer. 
	Puerto PS2*/
	
	/*TAREA: Hacer un Sway de la sección 2.1*/
}
