package com.rocket.afm;

public interface RocketFactory<T> {

	T createRocket(String type);

}
