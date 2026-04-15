class Payment extends Thread {
    public void run() {
        System.out.println("Processing payment...");
    }
}

class OrderProcessing extends Thread {
    public void run() {
        System.out.println("Order confirmed...");
    }
}

class OnlineShoppingSystem {
    public static void main(String[] args) {
        Payment p = new Payment();
        OrderProcessing o = new OrderProcessing();

        p.start();
        try {
            p.join();
        } catch (InterruptedException e) {
            System.out.println("Error");
        }
        o.start();
    }
}