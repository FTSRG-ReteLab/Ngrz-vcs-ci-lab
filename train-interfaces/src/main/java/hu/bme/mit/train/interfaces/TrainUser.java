package hu.bme.mit.train.interfaces;

public interface TrainUser {

	int getJoystickPosition();

	boolean getAlarmState();

	void setAlarmFlag(boolean state);

	void overrideJoystickPosition(int joystickPosition);

}
