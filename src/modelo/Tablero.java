package modelo;

import control.Iniciable;

public class Tablero implements Iniciable {

	protected Carta tablero[][];

	public Tablero() {
		super();
	}

	public Carta[][] getTablero() {
		return tablero;
	}

	public void setTablero(Carta[][] tablero) {
		this.tablero = tablero;
	}

	@Override
	public void desordenarTablero() {
		// TODO Auto-generated method stub

	}

}
