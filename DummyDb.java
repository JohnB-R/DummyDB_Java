package orig;

class DummyDb {
    public static void main(String[] args) {

        System.out.println("Running the version really before any change!");
        SqlRunner runner = new SqlRunner();
        runner.runSql(); // Call to WRITE

        runner.runSql(); // And here we only want to READ.

    }
}

/* The output should be

Loading driver
Connecting
Writing
Closing
...
Loading driver
Connecting
Reading
Closing

*/
