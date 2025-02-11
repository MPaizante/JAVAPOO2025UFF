x = [10,5,9,7,1,2,6,22,56,88,3]
y = []
c = len(x)-1

for i in range(len(x)):
    for j in range(len(x)-1):
        if x[i] < x[j]:
            x[i],x[j]=x[j],x[i]
    
print(x)

def fat(x):
    if x == 0 or x == 1:
        return 1
    else:
        return x * fat(x-1)
    
print(fat(3))

def binario(x):
    if x == 1:
        return  "1"
    elif x == 0:
        return "0"
    else:
        return binario(x//2) + str(x % 2)
print(binario(20))