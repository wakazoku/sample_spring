# sample_spring
Springの勉強用リポジトリ
https://www.shuwasystem.co.jp/book/9784798053745.html

## 事前にインストールが必要な物
* Java1.8
* Tomcat9
* Eclipse 2019-03
  * Eclipse日本語化
  * STS3(Eclipseプラグイン)
* Maven10
  * パスを通す
 
 ## Mavenビルド関連
dependencyは手書きではなくMavenセントラルリポジトリで検索してコピペしていけ！  
https://mvnrepository.com/search?q=spring

pomのバージョンを上げたいときは以下を参考に↓  
https://kazuhira-r.hatenablog.com/entry/20160528/1464444327  

更新可能パッケージのバージョンを表示
```bash
mvn versions:display-dependency-updates
```
更新可能プラグインのバージョンを表示
```bash
mvn versions:display-plugin-updates
```

依存ライブラリをアップデートする
```bash
mvn versions:use-latest-releases
```
または
```bash
mvn versions:use-latest-versions
```

### ・ちなみに以下のようにバージョンが変数として設定されていると自動更新されない。  
　新規で作ると以下のようになってるので直接バージョンを書き直す。
```xml
<properties>
    <!-- Spring -->
    <spring-framework.version>3.2.3.RELEASE</spring-framework.version>
</properties>

<dependencies>
    <dependency>
        <groupId>org.springframework</groupId>
        <artifactId>spring-context</artifactId>
        <version>${spring-framework.version}</version>
    </dependency>
</dependencies>
```
## ・pom.xmlではpackagingはjar指定なのに、failOnMissingWebXmlのエラーが表示され続けるときの対処
以下の神記事で対処  
https://qiita.com/k3286/items/1bc86cdbd58892d078a5
```xml
<packaging>war</packaging>

<properties>
  <failOnMissingWebXml>false</failOnMissingWebXml>
</properties>
```
※本来はweb.xmlをどこかに配置してあげるのが正しいらしい  
http://takunoji.hatenadiary.jp/entry/2016/01/10/093245

### ・Mavan > プロジェクトの更新をするとJavaのバージョンが落ちる…
神降臨！以下を追加すると更新してもJavaのコンパイラのバージョンが固定される。  
https://qiita.com/kz1202/items/aa0f2f110908ff7ff530

```xml
<properties>
    <java.version>1.8</java.version>
    <maven.compiler.target>${java.version}</maven.compiler.target>
    <maven.compiler.source>${java.version}</maven.compiler.source>
</properties>
```
