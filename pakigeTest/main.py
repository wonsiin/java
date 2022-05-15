#animal package
#dog, cat modules
#dog, cat modules can say "hi"
#main 이라는 기본 파일이 필요하다.
#그러지 않으면 실행이 불가함

# from animol import dog #animol 패키지에서 dog 모둘 가져옴
# from animol import cat
# from animol import *

# d = Dog()
# c = Cat()

# # d = dog.Dog() #instance
# d.hi()
# # c = cat.Cat()
# c.hi()
# from animol.dog import Dog #이거랑 같음

from geopy.geocoders import Nominatim
geolocator = Nominatim(user_agent="wonie")
location = geolocator.geocode("Seoul, South Korea")
print(location.latitude)
print(location.raw)
