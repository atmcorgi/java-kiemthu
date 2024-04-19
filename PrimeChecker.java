public class PrimeChecker {
    public static void main(String[] args) {
        // Đầu vào là một số nguyên
        int numberToCheck = 17; // Có thể thay đổi số này để kiểm tra các trường hợp khác nhau

        // Gọi phương thức để kiểm tra số nguyên tố
        boolean isPrime = isPrimeNumber(numberToCheck);

        // Kiểm tra và in kết quả
        if (isPrime) {
            System.out.println(numberToCheck + " là số nguyên tố.");
        } else {
            System.out.println(numberToCheck + " không là số nguyên tố.");
        }
    }

    // Phương thức kiểm tra số nguyên tố
    public static boolean isPrimeNumber(int number) {
        // Kiểm tra số nguyên tố từ 2 đến căn bậc hai của số
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
