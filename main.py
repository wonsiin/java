#정수 + 문자 연산합
x = 1
y = "5"

print(str(x) + y)
print(x - int(y))

#boolean
x = True
y = False
#조건
x = 3
if not 2>1:
  print("hello2")
if 2>1:
  print("hello1")
if 1>0 and 2 > 1:
  print("hello12") 
if 0>0 and 2 > 1:
  print("hello22") 
if x>2 :
  print("hello3")
if x == 3 :
  print("hello9")
if x>5 :
  print("hello3")
else :
  print("Hi")
# 함수
def chat():
  print("안녕반가워")
  print("응반가워")
chat()
def chat(name1, name2,age):
  print("%s , 안녕? 반가워 몇살이야?"% name1)
  print("%s , 나도 반가워 나는 %d야" % (name2, age)) # 2개이상은 묶는다?
chat("철수","영희",30)
#--------------------------
def su(a,b):
  result = a + b
  return result
a =1
b =2
c =a+b
d = su(5,22)
print(d)

#먼저 이름과 나이를 받는다
#나이가 10살 미만 안녕 이라고 말
#나이가 10~ 20살 사이면 안녕하세요
#그 외에는 안녕하십니까
def say(name,age):
  if age < 10:
    print("안녕 " + name)
  elif age <= 20 and age >= 10:
    print("안녕하세요 " + name)
  else :
    print("안녕하십니까 " + name)
say("워니", 9)
say("워놉", 10)
say("아니", 20)
# 맨 앞단에 안적고 띄어서 적게되면 실행x

#반복문 for,while
#in은 i에 값을 넣어라.
# range 는 횟수만큼 돌려라
# for i in range (10):
#   print("철수 : 안녕 영희야")
#   print("영희 : 안녕 철수야 그냥있어")
for i in range (3):
  print(i)
  print("철수 : 안녕 영희야")
  print("영희 : 안녕 철수야 그냥있어")
i = 0

while i < 3:
  print(i)
  print("철수 : 안녕 영희야")
  print("영희 : 안녕 철수야 그냥있어")
  i = i + 1
#break, continue

i = 0
while i < 3:
  print(i)
  print("철수 : 안녕 영희야")
  print("영희 : 안녕 철수야 그냥있어")
  i = i + 1
  if i > 2:
    break;
  #----------------------------------  
for i in range (3):
  print(i)
  print("철수 : 안녕 영희야1")
  print("영희 : 안녕 철수야 그냥있어1")
  if i > 2:
    break;
#----------------------------------
for i in range (3):
  print(i)
  print("철수 : 안녕 영희야1")
  print("영희 : 안녕 철수야 그냥있어1")
  if i == 1:
    continue #밑코드를 실행하고싶지 않을때 사용
  print(" 안녕 모두")
#자료구조
#list tuple
x = [1,2,3,4]
#    0 1 2 3 순서
y = ["hello","world"]
z = ["hello",1,2,3]
x[2] = 20
print(x[2])
# num_elements = len(x) 밑에꺼 사용해도 될듯
# print(num_elements)
t = len(x)
print(t)

y=sorted(x)
print(y)

z = sum(x)
print(z)
#반복문도 합쳐서
#x 값을 n에 차례대로 넣어줘 그리고 n을 확인
for n in x:
  print(n)
y = ["hello","world"]
for n in y:
  print(n)
# print(x.index(3))
print()
print(y.index("hello"))
#"hello" 문장이 y안에 있는지 확인 true & False
print("hello" in y)
if "hello" in x:
  print("hello가 있어요")
else:
  print("없어요")
x=(1,2,3)
y = ('a','b','c')
z = (1,"hello","there")

print(x + y)
print('a' in y)
print(z.index(1))
#mutable(가변) vs immutable(불변)
# x[0] = 10
# print(x[0])

#딕셔너리
x = dict()
y = {}
print(x)
print(y)

x = {
  "name": "워니",
  "age" : 20,
  
}

x = {
  0: "wonie",
  1 : "hello",
  "age" : 20,
  
}
#key 와  velue 값같은 정의
print(x)
print(x[0])
print(x[1])
print(x["age"])

print("age" in x)
print("name" in x)
print(x.keys())
print(x.values())
#문자열과 할땐 str을 해줘야하나보다 아니면 오류
for key in x:
  print("key" + str(key))
  print("value " + str(x[key]))
x[0] = "워니"
print(x[0])
#값 추가
x["school"] = "햇빛"
print(x)
#------------------------------------------------------
fruit =["사과","사과","바나나","바나나","딸기","키위","복숭아","복숭아","복숭아"]
d = {}
for f in fruit:
  if f in d: #사과 라는 key가 d 라는 딕셔너리에 들어있어?
    d[f] = d[f] + 1 #그럼 사과 개수 올려줘
  else :
    d[f] = 1 #만약 사과라는 애가 없으면, 그걸 딕셔너리에 넣고 벨류는 1로
print(d)

