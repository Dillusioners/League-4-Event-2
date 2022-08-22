from math import sqrt
 
def check(x):
    template = "1_2_3_4_5_6_7_8_9_0"
    if (len(str(x)) != len(template)):
        return False
    return str(x)[::2] == "1234567890"
 
low = int(sqrt(1020304050607080900))/10
high = int(sqrt(1929394959697989900))/10
 
for i in range(int(low), int(high + 1), 2):
    x = i * 10
    if check(x * x):
        print(x, x * x)
        break
