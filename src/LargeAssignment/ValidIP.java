package LargeAssignment;

import java.util.Scanner;

public class ValidIP {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a IP Address :");
        String ip=s.nextLine();
        if (isValidIP(ip)) {
            System.out.println(ip + " is a valid IPv4 address");
        } else {
            System.out.println(ip + " is not a valid IPv4 address");
        }
    }

    public static boolean isValidIP(String ip) {
        String[] parts = ip.split("\\.");
        if (parts.length != 4) {
            return false;
        }
        for (String part : parts) {
            if (part.length() > 1 && part.startsWith("0")) {
                return false;
            }
            int num = Integer.parseInt(part);
            if (num < 0 || num > 255) {
                return false;
            }
        }
        return true;
    }
}
//192.168.0.0