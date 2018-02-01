package com.ardoise.observer;

import java.util.List;

import com.ardoise.model.Point;

public interface Observateur {

	public void update(List<Point> dessin);
}
