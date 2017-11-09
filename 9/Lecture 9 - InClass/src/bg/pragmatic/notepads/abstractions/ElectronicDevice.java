package bg.pragmatic.notepads.abstractions;

public interface ElectronicDevice extends Notepad{

	void start();
	void stop();
	boolean isStarted();
}
