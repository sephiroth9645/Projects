studentName = raw_input('What is your name?')
studentDegree = raw_input('What is your degree?')
studentCredits = input('How many credits have you taken?')
degreeCredits = input('How many credits are in your degree?')
remainingCredits = degreeCredits - studentCredits

print studentName, ' is in ', studentDegree, ' and has ', remainingCredits, ' left to take.'
