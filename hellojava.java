class helloITI {

	public static void main(String[] args) {
		helloITI app = new helloITI();
		app.start();
	}

	void start() {
		printWelcome();
		printStatus();
	}

	void printWelcome() {
		System.out.println("Welcome to ITI Java Track");
	}

	void printStatus() {
		System.out.println("Git is controlling this project");
	}

	void shutdown() {
		// make conflict by abdelhamed
		System.out.println("conflict made successfully by abdelhamed");
		System.out.println("Application terminated successfully with conflict");
	}
}
//comments made by tayseer
