package chapter04;

import java.io.Serializable;

public class OrderDao implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7775564558445864471L;
	
	public boolean isNotReadyToShip(Order order) {
        // In a real scenario, this would check the status of the order in the DB.
        return true;
    }

    public void updateStatusToReadyToShip(Order order) {
        // In a real scenario, this would update the status of the order in the DB.
    }

    public void updateStatusToDenied(Order order) {
        // In a real scenario, this would update the status of the order in the DB.
    }

}
