import java.util.Scanner;

public class KullaniciGirisi {
    public static void main(String[] args) {
   /*     Ödev
        Eğer şifre yanlış ise kullanıcıya şifresini sıfırlayıp sıfırlamayacağını sorun,
        eğer kullanıcı sıfırlamak isterse yeni girdiği şifrenin hatalı
        girdiği ve unuttuğu şifre ile aynı olmaması gerektiğini kontrol edip, şifreler aynı ise ekrana
        "Şifre oluşturulamadı,""lütfen başka şifre giriniz." sorun yoksa "Şifre oluşturuldu" yazan programı yazınız.*/

        String userName, password, dbUserName = "patika", dbPassword = "java123";

        Scanner input = new Scanner(System.in);

        System.out.print("Kullanıcı Adınız:");
        userName = input.nextLine();

        System.out.print("Şifreniz:");
        password = input.nextLine();

        if (userName.equals(dbUserName)) {
            if (password.equals(dbPassword)) {
                System.out.println("Bilgileriniz Doğru Giriş Sayfasına Yönlendiriliyorsuz!");
            } else {
                System.out.println("Kullanıcı Adınız Doğru Şifreniz Yanlış!");
            }
        } else {
            System.out.println("Kullanıcı Adı Hatalı!");
        }
    }

}

