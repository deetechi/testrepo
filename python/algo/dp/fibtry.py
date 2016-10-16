def fibmem(n, lookup):
	if n == 0 or n == 1 :
		lookup[n] = n;

	if lookup[n] is None:
		lookup[n] = fibmem(n-1, lookup) + fibmem(n-2, lookup)

	return lookup[n]


def fibtab(n, tab):
	tab[1] = 1

	for i in xrange(2, n+1):
		#print i
		tab[i] = tab[i-1] + tab[i-2]
		#print tab[i]

	return tab[n];


n = 99
lookup = [None]*(n+1)
print fibmem(n, lookup)

tab = [0]*(n+1)
print fibtab(n, tab)
 