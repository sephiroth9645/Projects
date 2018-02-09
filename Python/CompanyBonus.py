def Main():
    print "Welcome to give a bonus"
    print

    bonus = getBonus()
    checkBonus(bonus)
    checkDayOff(bonus)

def getBonus():
    bonus = input('How many sales were their this month?')
    return bonus

def checkBonus(bonus):
    if bonus > 100000:
        print 'You get a 5000 dollar bonus this month.'

def checkDayOff(bonus):
    check = 90000 * 1.25
    if bonus > check:
        print 'Meatbag gets a day off. Boo.'
    elif bonus < check:
        print 'Meatbag slave must work another day hahaha.'

Main()
