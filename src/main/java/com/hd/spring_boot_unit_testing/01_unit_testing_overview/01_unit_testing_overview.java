/**
 * Unit test neden gereklidir ?
 *
 * Unit test kodu pushlamadan önce sizin kodu gözden geçirmenizi zorlar çünkü testini yazmanız lazım.
 * Yazdığınız bir kodun gözden kaçırdığınız veri girişlerini test sayesinde yeniden görebilirsiniz.
 * Test işlemini otomatize ederek projeyi ayağa kaldırmadan test etmenizi sağlar.
 * Yöneticiniz sizin bu kod çalışıyor demenizden ziyade yazdığınız testleri çalıştırarak kodun çalıştığına güvenebilir.
 * Devops ve Build Pipelines için önemlidir
 * Continuous Integration / Continuous Deployment (CI / CD) için önemlidir yanlış kod push lamanızı önler.
 * Canlıya çıkınca pek çok hataya kayba ve zamana sebep olacak bir hatayı daha teste bile çıkmadan yakalamanızı sağlar.
 *
 * Örn: Bir toplam fonksiyonu yazdınız test yazarken sayıların ondalıklı, negatif , sıfır , null gelebileceğini hatta
 * metin olarak bile veri girilecebileceğini kontrol etmiş olmanız gerekecek ancak kodu yazarken bunu düşünmek zordur.
 * Kodu test ederken bunlar daha kolay düşünülebilir.
 *
 * Integeration Test nedir?
 *
 * entegrasyon testi (integration test), yazılım geliştirme sürecinde bir veya daha fazla yazılım bileşeninin bir araya getirilerek,
 * bu bileşenlerin birlikte çalışma yeteneğini değerlendirmek için yapılan bir tür test türüdür.
 * Java gibi programlama dilleriyle geliştirilen yazılımlarda da entegrasyon testleri önemlidir.
 * Entegrasyon testleri, yazılımın farklı parçalarının bir araya geldiğinde beklenen işlevselliği sağlayıp sağlamadığını
 * kontrol etmek için kullanılır.
 *
 * Entegrasyon testlerinin temel amacı, yazılımın farklı bileşenlerinin birbiriyle uyumlu bir şekilde çalışıp
 * çalışmadığını sınayarak olası hataları ve uyumsuzlukları tespit etmektir.
 * Bu testler genellikle birim testlerin (unit tests) ötesine geçer ve yazılımın farklı modüllerinin veya bileşenlerinin
 * birbiriyle iletişimini ve etkileşimini test eder.
 *
 * Java'da entegrasyon testleri genellikle şu adımları içerir:
 *
 * Bileşenlerin Tanımlanması: Entegrasyon testleri yapılacak bileşenler tanımlanır. Bu bileşenler,
 * yazılımın farklı parçalarını temsil ederler.
 *
 * Senaryoların Oluşturulması: Her bir entegrasyon senaryosu, farklı bileşenlerin nasıl bir araya geleceğini ve hangi
 * koşullarda test edileceğini belirler. Örnek bir senaryo, kullanıcıların bir web uygulamasına giriş yapmasını ve
 * ardından bir veritabanından veri çekmelerini içerebilir.
 *
 * Test Ortamının Hazırlanması: Entegrasyon testlerinin çalışabilmesi için gerekli olan ortam
 * (örneğin, veritabanı bağlantıları, web sunucusu vb.) hazırlanır.
 *
 * Testlerin Yürütülmesi: Entegrasyon senaryoları çalıştırılır ve bileşenlerin birbiriyle nasıl etkileşimde bulunduğu gözlemlenir.
 *
 * Sonuçların Değerlendirilmesi: Testlerin sonuçları değerlendirilir ve herhangi bir hata veya uyumsuzluk tespit edilirse, bu sorunlar giderilir.
 *
 * Raporlama: Test sonuçları raporlanır ve geliştirme ekibi tarafından giderilmesi gereken sorunlar belirlenir.
 *
 * Entegrasyon testleri, yazılımın daha büyük bir resmini görmek için önemlidir ve farklı bileşenlerin bir
 * araya geldiğinde nasıl çalıştığını anlamak için kullanılır. Bu, uygulamanın gerçek dünyada nasıl davranacağını daha
 * iyi simüle etmeye yardımcı olur ve kullanıcı deneyimini iyileştirmeye katkıda bulunabilir.
 *
 * entagrasyon testleri dbler, file system vs, pek çok mocklanarak kullanılabilir.
 * */

/**
 * Unit Test Frameworkleri ?
 *
 * JUnit: JUnit, Java topluluğunda en yaygın olarak kullanılan birim test çerçevesidir.
 * JUnit, test sınıflarınızı oluşturmanıza, test metotlarınızı tanımlamanıza ve testlerinizi kolayca çalıştırmanıza
 * olanak tanır. Hem JUnit 4 hem de JUnit 5 sürümleri mevcuttur.
 *
 * TestNG: TestNG, JUnit'e alternatif olarak kullanılabilen bir birim test çerçevesidir.
 * TestNG, JUnit'ten daha fazla özellik sunar ve özellikle test gruplama, bağımlılık yönetimi ve
 * paralel test yürütme gibi yeteneklere sahiptir.
 *
 * Mockito: Mockito, Java uygulamalarında mock nesneleri oluşturmak ve testlerde kullanmak için kullanılan
 * bir çerçevedir. Mock nesneler, gerçek nesnelerin yerine geçebilir ve testlerin bağımlılıklarını yönetmek için kullanılır.
 *
 * PowerMock: PowerMock, Java sınıflarının davranışını daha fazla değiştirmenizi ve kontrol etmenizi sağlayan
 * bir birim test çerçevesidir. Özellikle final sınıfları ve statik metotları mocklamak için kullanışlıdır.
 *
 * Spock: Spock, Java ve Groovy tabanlı birim test çerçevesidir. Spock, doğru ve okunabilir testler yazmak için temiz
 * ve açık bir sözdizimine sahiptir. Ayrıca BDD (Behavior-Driven Development) yaklaşımını destekler.
 *
 * Testcontainers: Testcontainers, Java uygulamalarınızın Docker konteynerlerini kullanarak entegrasyon
 * testleri yapmanızı sağlayan bir çerçevedir. Bu, özellikle veritabanı testleri gibi durumlarda kullanışlıdır.
 *
 * Arquillian: Arquillian, Java EE (Enterprise Edition) uygulamalarını test etmek için kullanılan bir çerçevedir.
 * Özellikle JEE uygulamalarını test etmek isteyenler için uygundur.
 *
 * */


/**
 * Unit Testing Tooling Support ?
 *
 * İntellij idea testlerin izlenmesi çalıştırılması istatistisğinin görüntülenmesi için görsellik ve veri için çok gelişmiştir.
 * Başarılı başarısız olan testleri kırmızı yeşiş gösterir sayar vs...
 *
 * Eclipse de de var benzer mevzular.
 *
 * */

