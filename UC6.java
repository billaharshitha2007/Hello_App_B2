class HelloApp {

    public static void main(String[] args) {

        String message;

        if (args.length > 0) {

            StringBuilder nameBuilder = new StringBuilder();

            // Enhanced for loop
            for (String name : args) {
                nameBuilder.append(name).append(", ");
            }

            // Remove last ", "
            String names = nameBuilder.substring(0, nameBuilder.length() - 2);

            message = "Hello, " + names + "!";
        } else {
            message = "Hello, World!";
        }

        System.out.println(message);
    }
}