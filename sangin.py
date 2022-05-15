class Person:
  def __init__(self,name,age):
    self.name = name
    self.age = age

  def say_hello(self,to_name):
    print("안녕! "+ to_name + 
          " 나는 " + self.name)
  def inti(self):
    print("내이름은 "+self.name
         + "그리고 나는 " + 
         str(self.age) + " 살이야")

wonie = Person("워니",20)
michel = Person("마이클",50)
jenny = Person("제니",30)

wonie.inti()

wonie.say_hello("철수")
michel.say_hello("영희")
jenny.say_hello("미지")

class Police(Person):
  def arrest(self,to_arrest):
    print("넌 체포됨" + to_arrest)
#상속이되어 Person 의 메소드도 사용가능
class Programmer(Person):
  def program(self,to_program):
    print("뭘 만들까 아 이거다" + to_program)
#상속이되어 Person 의 메소드도 사용가능
wonie = Person("워니",20)
jenny = Police("제니",30)
michel = Programmer("마이클",50)

wonie.inti()
jenny.inti()
michel.inti()
jenny.arrest("워니")
michel.program("이메일")

