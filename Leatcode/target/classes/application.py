print("hi")

myStr = list("please revert me")
i = 0
j = len(myStr) - 1
while i < j:
    temp = myStr[i]
    myStr[i] = myStr[j]
    myStr[j] = temp
    i += 1
    j -= 1
print(myStr)
