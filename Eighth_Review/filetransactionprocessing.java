package Eighth_Review;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Stream;

class InvalidTransactionException extends Exception {
    private static final long serialVersionUID = 1L;
    
    public InvalidTransactionException(String message) {
        super(message);
    }
}

public class filetransactionprocessing{
    
    public static void processWithExceptoin(String filename) {
        Path path = Paths.get(filename);
        
        try (Stream<String> lines = Files.lines(path)) {
            List<Integer> transacitons = lines
                .map(line -> {
                    try {
                        return Integer.parseInt(line.trim());
                    } catch (NumberFormatException e) {
                        throw new RuntimeException(new InvalidTransactionException(
                            "Invalid transaction data: " + line));
                    }
                })
                .toList();
                
            int sum = transacitons.stream().mapToInt(Integer::intValue).sum();
            OptionalInt max = transacitons.stream().mapToInt(Integer::intValue).max();
            
            System.out.println("Sum of Transactions: " + sum);
            System.out.println("Max Transaction: " + max.getAsInt());
            
        } catch (IOException e) {
            System.out.println("File error: " + e.getMessage());
        } catch (RuntimeException e) {
            if (e.getCause() instanceof InvalidTransactionException) {
                System.out.println("InvalidTransactionException: " + e.getCause().getMessage());
            } else {
                throw e;
            }
        }
    }
    
    public static void processSkippingInvalid(String filename) {
        Path path = Paths.get(filename);
        
        try (Stream<String> lines = Files.lines(path)) {
            List<Integer> validTransactions = lines
                .filter(line -> checkValid(line))
                .map(line -> Integer.parseInt(line.trim()))
                .toList();
            
            int sum = validTransactions.stream().mapToInt(Integer::intValue).sum();
            OptionalInt max = validTransactions.stream().mapToInt(Integer::intValue).max();
            
            System.out.println("Sum of Transactions: " + sum);
            System.out.println("Max Transaction: " + max.getAsInt());
            
        } catch (IOException e) {
            System.out.println("Error reading: " + e.getMessage());
        }
    }
    
    private static boolean checkValid(String line) {
        try {
            Integer.parseInt(line.trim());
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    
    public static void createTestFile(String filename) {
        String content = "100\n200\nabc\n300\n400\nxyz\n500\n";
        
        try {
            Files.writeString(Paths.get(filename), content);
        } catch (IOException e) {
            System.out.println("cant create file");
        }
    }
    
    public static void main(String[] args) {
        String filename = "transactions.txt";
        
        createTestFile(filename);
        
        System.out.println("Testing with exception:");
        processWithExceptoin(filename);
        
        System.out.println("\nTesting skip invalid:");
        processSkippingInvalid(filename);
    }
}