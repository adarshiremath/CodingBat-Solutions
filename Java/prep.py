with open('./test.txt') as f:
    lines = f.readlines()
    for line in lines:
        f1 = open("./Warmup-1/"+line.strip()+".java","x")
        f1.close()