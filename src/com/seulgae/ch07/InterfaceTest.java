package com.seulgae.ch07;
class A {
      public void methodA(B b) { 
            b.methodB(); 
      } 
} 

class B { 
      public void methodB() { 
            System.out.println("B클래스의 메서드"); 
      } 
}

class ㅊ { 
    public void methodB() { 
          System.out.println("B클래스의 메서드"); 
    } 
} 

class InterfaceTest { 
      public static void main(String args[]) { 
            A a = new A(); 
            a.methodA(new B()); // A가 B를 사용(의존)
      }
}
