def Main ():
   print 'Welcome to meal price'
   print
   ticket = inputTicket()
   tip = calcTip(ticket)
   tax = calcTax(ticket)
   total = calcTotal(ticket, tip, tax)
   displayTotal(ticket, tip, tax, total)

def inputTicket():
   ticket = input('What is the meai price?')
   return ticket

def calcTip(ticket):
   tip = ticket * .2
   return tip

def calcTax(ticket):
    tax = ticket * .006
    return tax

def calcTotal(ticket, tip, tax):
   total = ticket + tip + tax
   return total

def displayTotal(ticket, tip, tax, total):
    print 'The meal price is: $', ticket
    print 'The tip is: $', tip
    print 'The tax is: $', tax
    print 'The total is: $', total

Main()
