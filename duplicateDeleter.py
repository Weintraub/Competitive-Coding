import re

import os

def my_rename(path, name, extension, prefix, suffix):
    os.rename(path + '/' +          old_name          + '.' + extension,
              path + '/' + prefix + old_name + suffix + '.' + extension)



x = 1
dictionary = {}
for author in os.listdir('C:/Users/Daniel/Desktop/test/'):

    if x>1 and x<300:

        st = "C:/Users/mioya/Desktop/test/" + author.name

       	print "Address: " + st + " #" + str(x)
       	for year in range(2005,2016):
            for pdftitle in os.listdir('C:/Users/Daniel/Desktop/test/' + string(year)):
                print(pdftitle.name)
                if !pdftitle in dictionary:
                    dictionary[pdftitle] = year
                    my_rename(':/Users/Daniel/Desktop/test/', 'x', 'mkv', 'Movie1 ', ' [720p]') #Change vars and file is renamed
        
                
                                 

    
