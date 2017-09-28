package com.processing.sketch;

import java.util.ArrayList;

/**
 * Created by Marcelo Vogt on 28/09/2017.
 */
public class Network {

	private int nInputs;
	private int inputLenght;
	private int nLayers;
	private ArrayList<Layer> layers;

	public Network(int nInputs, int inputLenght, int nLayers, ArrayList<Integer> nNeurons) {
		this.nInputs = nInputs;
		this.inputLenght = inputLenght;
		this.nLayers = nLayers;
		layers = new ArrayList<>(nLayers);
		for (int i = 0; i < nLayers; i++) {
			layers.add(i, new Layer(nNeurons.get(i)));
		}
	}

	public double input(ArrayList<Double> inputs) {
		return
	}

}
