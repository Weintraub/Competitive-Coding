import smtplib
import mimetypes
import time
from email.mime.multipart import MIMEMultipart
from email import encoders
from email.message import Message
from email.mime.audio import MIMEAudio
from email.mime.base import MIMEBase
from email.mime.image import MIMEImage
from email.mime.text import MIMEText
from random import choice
from string import ascii_uppercase

def verifyNum():
    num = int(raw_input("How many people do you want to recieve this email? "))
    while(num < 1):
        print "That is an invalid number"
        num = int(raw_input("How many people do you want to recieve this email? "))
    return num

def emailTo(boolean):
    if(boolean):
        numEmailSend = verifyNum();
        emails = raw_input("Send email to who? ") 
        for i in range(0,numEmailSend-1):
            emails += "," + raw_input("Send email to who? ")
    else:
        numEmailSend = int(raw_input("How many people do you want to cc this email? "))
        if(numEmailSend < 1):
            return ""
        emails = raw_input("Cc this email to who? ") 
        for i in range(0,numEmailSend-1):
            emails += "," + raw_input("Cc this email to who? ")
    return emails

def randomSubject():
    return ''.join(choice(ascii_uppercase) for i in range(15))

def randomTextWall():
    return ''.join(choice(ascii_uppercase) for i in range(50))

def createEmail(emailto, emailfrom, fileToSend):
    body = randomTextWall()
    msg = MIMEMultipart()
    msg["From"] = emailfrom
    msg["To"] = emailto
    #msg["Cc"] = ccto
    msg["Subject"] = randomSubject()
    msg.attach(MIMEText(body))

    #File Attachement 
    ctype, encoding = mimetypes.guess_type(fileToSend)
    if ctype is None or encoding is not None:
        ctype = "application/octet-stream"
    maintype, subtype = ctype.split("/", 1)
    if maintype == "text":
        fp = open(fileToSend)
        # Note: we should handle calculating the charset
        attachment = MIMEText(fp.read(), _subtype=subtype)
        fp.close()
    elif maintype == "image":
        fp = open(fileToSend, "rb")
        attachment = MIMEImage(fp.read(), _subtype=subtype)
        fp.close()
    elif maintype == "audio":
        fp = open(fileToSend, "rb")
        attachment = MIMEAudio(fp.read(), _subtype=subtype)
        fp.close()
    else:
        fp = open(fileToSend, "rb")
        attachment = MIMEBase(maintype, subtype)
        attachment.set_payload(fp.read())
        fp.close()
        encoders.encode_base64(attachment)
    attachment.add_header("Content-Disposition", "attachment", filename=fileToSend)
    msg.attach(attachment)

    return msg






#---------Constants---------------
emailfrom = "sender@example.com"
emailto = emailTo(True)
#ccto = emailTo(False)
fileToSend = "great.csv"
username = "garlicbuns22"
password = "testing1234"
#---------------------------------

#Initializing 
server = smtplib.SMTP("smtp.gmail.com:587")
server.starttls()
server.login(username,password)

#Sending the emails
numEmails = int(input("How many emails to send? "))
t0 = time.time()
for i in range (0,numEmails):
    msg = createEmail(emailto,emailfrom,fileToSend)
    server.sendmail(emailfrom, emailto, msg.as_string())
    print "mail sent"
t1 = time.time()
print t1-t0 #time
server.quit()
