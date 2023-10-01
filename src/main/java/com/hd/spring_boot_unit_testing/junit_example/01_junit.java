/**
 * Junit ile toplama fonksiyonu yazıp daha sonra buna test yazacağız.
 *
 * 1. Maven Junit-jupiter dependencies ekle
 *         <dependency>
 *             <groupId>org.junit.jupiter</groupId>
 *             <artifactId>junit-jupiter</artifactId>
 *             <version>5.8.2</version>
 *             <scope>test</scope>
 *         </dependency>
 *
 * Maven projelerinin yönetildiği pom.xml (Project Object Model) dosyalarında <dependency> etiketi içinde bulunan
 * <scope> etiketi, bir bağımlılığın proje tarafından hangi bağlamda kullanılacağını belirlemeye yardımcı olan bir
 * XML özelliğidir. Bu <scope> etiketi, Maven tarafından bağımlılığın nasıl ele alınacağını ve hangi aşamada
 * kullanılacağını kontrol etmek için kullanılır.
 *
 * Maven'de kullanılan yaygın <scope> değerleri şunlardır:
 *
 * compile: Bu, varsayılan <scope> değeridir. Bağımlılığın projenin derleme ve çalıştırma süreci boyunca kullanılmasını
 * ifade eder. Bu bağımlılıklar projenin sadece derlenmesi ve çalıştırılması sırasında değil, aynı zamanda projenin JAR
 * (Java Archive) veya WAR (Web Application Archive) dosyalarının oluşturulması sırasında da dahil edilir.
 *
 * provided: Bu, bağımlılığın derleme ve çalıştırma aşamasında kullanılacağını, ancak uygulamanın dağıtım sırasında
 * sağlanacağını ifade eder. Genellikle Java EE uygulamaları gibi durumlarda kullanılır, çünkü sunucu tarafından
 * sağlanan API'leri temsil edebilir. Derleme sırasında kullanılır, ancak bağımlılık uygulama sunucu tarafından temin edilir.
 *
 * test: Bu, bağımlılığın yalnızca test sınıfları içinde kullanılacağını ifade eder. Bu tür bağımlılıklar, test kodunun
 * derlenmesi ve çalıştırılması için kullanılır ve üretim kodunun parçası olarak paketlenmezler.
 *
 * runtime: Bu, bağımlılığın yalnızca çalışma zamanında kullanılacağını ifade eder. Derleme sırasında kullanılmaz,
 * ancak çalıştırma sırasında gerekli olabilir. Örneğin, JDBC sürücüsü gibi bağımlılıklar runtime <scope> ile işaretlenebilir.
 *
 * system: Bu, bağımlılığın yerel sistemde bulunması gerektiğini ifade eder. Genellikle nadir durumlarda kullanılır
 * ve bağımlılığın doğrudan sisteminizdeki bir dosyaya işaret etmesi gerektiğinde kullanılır.
 *
 * import: Bu, Maven 2.0.9 ve sonraki sürümlerde kullanılan özel bir <scope> değeridir. Bu, POM miras alma ve proje kalıbı
 * oluşturma işlemlerinde kullanılır.
 *
 * Bu <scope> değerleri, Maven projesindeki bağımlılıkların nasıl ele alınacağını belirlemeye yardımcı olur ve
 * bağımlılıkların projenin farklı aşamalarında nasıl davranacaklarını kontrol etmenize olanak tanır. Projenizin
 * ihtiyaçlarına göre doğru <scope> değerini seçmelisiniz.
 *
 * */