public class Main {
    public static void main(String[] args) {
        String phone = "965-701 45 09";
        phone = phone.replace(" ", "");
        phone = phone.replace("-", "");
        phone = phone.replace("+", "");
        if (phone.length() == 10) {
            phone = '7' + phone;
        } else if (phone.length() > 11) {
            throw new RuntimeException("Номер телефона слишком длинный");
        } else if (phone.length() < 10) {
            throw new RuntimeException("Номер слишком короткий");
        } else if (phone.length() == 11 && phone.charAt(0) != '7') {
            throw new RuntimeException("В начале не хватает 7ки");
        }
        System.out.println("phone = " + phone);

        String expectedPhone = "79657014509";
        if (expectedPhone.equals(phone)) {
            System.out.println("Успех");
        } else {
            System.out.println("Неуспех");
        }
    }
}