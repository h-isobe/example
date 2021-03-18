//コード7-1 JavaBeansの例
package model;  //ルール② クラスはpublicでパッケージに所属する

import java.io.Serializable; //ルール① 直列化可能にするためインターフェイスを実装

public class Human implements Serializable {  //ルール①直列化可能である。②クラスはpublicでパッケージに所属。
  private String name;
  private int age;

  public Human() { }  //ルール③ publicで引数のないコンストラクタを持つ
  public Human(String name, int age) {
	  this.name = name;
	  this.age = age;
  }

  //ルール④ 命名規則に従ったgetter/setterを持つ
  public String getName() {
	  return this.name;
  }
  public void setName(String name) {
	  this.name = name;
  }
  public int getAge() {
	  return this.age;
  }
  public void setAge(int age) {
	  this.age = age;
  }

}
