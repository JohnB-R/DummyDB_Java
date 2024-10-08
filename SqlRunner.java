package orig;

class SqlRunner {

    void runSql() {
        loadDriver();
        connectDb();

        // Aim: we want to write OR read. Not both!
        System.out.println("Writing");
        System.out.println("Reading");

        closeDb();
    }

    void loadDriver() {
        System.out.println("Loading driver");
    }

    void connectDb() {
        System.out.println("Connecting");
    }

    void closeDb() {
        System.out.println("Closing");
    }
}

