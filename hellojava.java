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
		System.out.println("Application terminated successfully");
	}
}
//comments made by tayseer
