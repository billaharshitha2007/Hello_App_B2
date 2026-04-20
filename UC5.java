class HelloApp {

    public static void main(String[] args) {

        String message;

        // Check if arguments are provided
        if (args.length > 0) {

            StringBuilder nameBuilder = new StringBuilder();
            boolean first = true;

            // Enhanced for loop
            for (String name : args) {

                // Avoid adding comma before first name
                if (!first) {
                    nameBuilder.append(", ");
                }

                nameBuilder.append(name);
                first = false;
            }

            message = "Hello, " + nameBuilder.toString() + "!";
        } else {
            // Default message
            message = "Hello, World!";
        }

        // Print result
        System.out.println(message);
    }
}