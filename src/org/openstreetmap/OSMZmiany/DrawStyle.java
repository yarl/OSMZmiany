package org.openstreetmap.OSMZmiany;

import java.awt.Graphics;

import org.openstreetmap.OSMZmiany.DataContainer.Node;

public interface DrawStyle {
	public void setZMapWidget(ZMapWidget map);
	public void drawNode(Graphics g,Node node);
}