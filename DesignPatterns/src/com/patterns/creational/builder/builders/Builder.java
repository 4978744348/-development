package com.patterns.creational.builder.builders;

import com.patterns.creational.builder.components.Garage;
import com.patterns.creational.builder.components.Pool;
import com.patterns.creational.builder.components.Roof;
import com.patterns.creational.builder.components.enumConst.Type;

/**
 * Builder interface defines all possible ways to configure a product.
 */
public interface Builder {

	void setType(Type type);

	void setRooms(int room);

	void setPool(Pool pool);

	void setWindow(int window);

	void setGarage(Garage garage);

	void setRoof(Roof roof);

}
