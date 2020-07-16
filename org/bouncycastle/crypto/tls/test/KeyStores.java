package org.bouncycastle.crypto.tls.test;

import org.bouncycastle.util.encoders.Base64;

public class KeyStores
{
    static final byte[] trustStore = Base64.decode(
        "/u3+7QAAAAIAAAABAAAAAgAGc2VydmVyAAABD34zDJEABVguNTA5AAABrzCC"
            + "AaswggEUAgEBMA0GCSqGSIb3DQEBBQUAMB4xHDAaBgNVBAMTE1Rlc3QgQ0Eg"
            + "Q2VydGlmaWNhdGUwHhcNMDYxMjEzMjM0MzI5WhcNMDYxMjIwMjM0MzI5WjAe"
            + "MRwwGgYDVQQDExNUZXN0IENBIENlcnRpZmljYXRlMIGfMA0GCSqGSIb3DQEB"
            + "AQUAA4GNADCBiQKBgQCmOumCM46ehsdcrZMw6tj0hMl5D0xf21gcyBj/ByIv"
            + "pe008ukaN3zCXIUUUlAu0GkbI1sCbTD1V4qVZuaHqtfa/FINJjyZJy5w7KEx"
            + "93OOF2/gyPlnEPGs6RPdThAPliSBsWKBKqtOdmKpwYn/NKuUNFRkFXVLLUPn"
            + "jyEKjIcNywIDAQABMA0GCSqGSIb3DQEBBQUAA4GBACi8J7raYqDFjXqAXXPJ"
            + "ljZHqvzJNVaSWvBtK/oY7g0+sdGIjPR526fhSCxOZRr7G157ERqMnPjuFjcm"
            + "cRlUOPsQtTl6KbUnxmKxa04UzDuNXzSx2oyGx5GCWx9u62hpO6vSpK69L9gH"
            + "OUtM5dQXcoK4i3olScKaU8qaYb0mBAy8fnx5pen8B0bIg+pz47l5VxQ5NO8=");

    static final byte[] server = Base64.decode(
        "/u3+7QAAAAIAAAABAAAAAQAGc2VydmVyAAABD34zDJIAAAK8MIICuDAOBgor"
            + "BgEEASoCEQEBBQAEggKk9OXWj3aBr6rV9Grcsm2YL+/2ShVsxbJVGMSWll1f"
            + "U8z/mjhv5K/skgleTIMoyE5FzDDxJIGEmSMCkcHsnseXzxyhLpKBaz3N1Tk7"
            + "KVPzXfrNh0FJwzw3lPWyC2ayT+ObQfAtzuI9SUWNLBzzpWeolUJ8gkXnLshX"
            + "5RqmR735NRZdjgQOtNYBBErX/NOhTyi009/CZDNxgJQzywFmQcXBLhNSA+0i"
            + "cE+LwZ4sZV0NXshPZiyNnsfqN/XNOyhpKr8a3VyVtee2nhO9+FY5IDEviHmR"
            + "WDvH5TmB6Os3L6xvwE1ZQCPElk/cK2G1q9+zDBe4JDeo8o7lPhiNpVfcivnr"
            + "+tyK9m7PqlssR0+ohuZGwrFMyzLugkOWh+qZ3pk8/7AwJosMvvTvIg36nN7R"
            + "pdnouQNKqTm1Sr/UUnKyWqfG7zqKIuF72IkDwwafwuQ9YRX5PAOuRfo6bCyb"
            + "D4w1OWdfGFciKMc1BrT+8JzhiTkzNe+jWEA5Tw1zeazPGpp1RHPz2np50G2s"
            + "v025uiOSUilBe13Qpx0mAyx7z8Gl6eOxai6rQ/eB/Fu++BMx0OX8vO/K4//Q"
            + "w43IPVPklGlb/3Qt7eoNf4tichuxrYJjHu4XbwnzB29Vmsan0XZFER7epvFj"
            + "cAZCSG+O6G/f6Ib+7d7xYjLdUaPI60tJ4/C+AuYwZn4jJwTnMnMmwIypz4Z8"
            + "XPXW5SbHlV5OkkFC+eAuuN4b2YXZmifeWv4fx65Ioir921LMJrorMizH41RJ"
            + "/rAO5wGSwjeDJ784QhhLGbEUMygraRtdaz6MRx26InnoHY7V58ET3Z5YGV39"
            + "p+9AtVhYw/QQmTZiF7hqnEMf9AMVFfac9qFF2+IN3g9HAMC6QLxJ1VuPn5oo"
            + "lS//axPfjckO7iZx9x59/gAAAAEABVguNTA5AAABrzCCAaswggEUAgEBMA0G"
            + "CSqGSIb3DQEBBQUAMB4xHDAaBgNVBAMTE1Rlc3QgQ0EgQ2VydGlmaWNhdGUw"
            + "HhcNMDYxMjEzMjM0MzI5WhcNMDYxMjIwMjM0MzI5WjAeMRwwGgYDVQQDExNU"
            + "ZXN0IENBIENlcnRpZmljYXRlMIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKB"
            + "gQCmOumCM46ehsdcrZMw6tj0hMl5D0xf21gcyBj/ByIvpe008ukaN3zCXIUU"
            + "UlAu0GkbI1sCbTD1V4qVZuaHqtfa/FINJjyZJy5w7KEx93OOF2/gyPlnEPGs"
            + "6RPdThAPliSBsWKBKqtOdmKpwYn/NKuUNFRkFXVLLUPnjyEKjIcNywIDAQAB"
            + "MA0GCSqGSIb3DQEBBQUAA4GBACi8J7raYqDFjXqAXXPJljZHqvzJNVaSWvBt"
            + "K/oY7g0+sdGIjPR526fhSCxOZRr7G157ERqMnPjuFjcmcRlUOPsQtTl6KbUn"
            + "xmKxa04UzDuNXzSx2oyGx5GCWx9u62hpO6vSpK69L9gHOUtM5dQXcoK4i3ol"
            + "ScKaU8qaYb0mBAy87VQaPfaiQqqxSgqifbSowlg+0fg=");

    static final byte[] client = Base64.decode(
        "MIACAQMwgAYJKoZIhvcNAQcBoIAkgASCA+gwgDCABgkqhkiG9w0BBwGggCSA"
            + "BIIDDzCCAwswggMHBgsqhkiG9w0BDAoBAqCCArIwggKuMCgGCiqGSIb3DQEM"
            + "AQMwGgQUyeN8U+ViAJCk1WGo8wTnRVOaE1oCAgQABIICgH3yMWB+dfMBNa07"
            + "hn3smUSBTF+LUauM+kx+12nZt0QazBYg09yM+aVcTznettlDwE/PTpKZnrFT"
            + "22DSQf5GwABwiL6KW+xyM8wV5vZx1xtqrQoNf2oNHnF0lB7ddSYM8jHqennb"
            + "bzcVOdrrCqewqAfUU/CDugpwwI8c8Iy9ECri6vBMbfeIIZQTug+1952TCCiA"
            + "E1bEDFGqgAoDsqYi6uNtpjmL/DPX/qmkbHAXUKxOtjTtxacfat2HgN97Gb7z"
            + "+ZBNI5aaCSRoYwl+K9biWGID3EqsNmg0+2ELmFhE4mQZ78i7vNLTG7e5mj6v"
            + "Qt+QuqN+daCbVqVTKxsFpODRRweobUTRxwEun6p0p3w3SUhR6p7ug1Jttgyu"
            + "vfZug3PIk2j9fb26wAs2ZreVYut8hXpp/09ulCUudtlsYb/FD+H11v/JyopG"
            + "2vYy0hL/gkMr41sGoVdyvzXeZUa7A1wYask+g7torad9sT8CPb3zXBd0kU2r"
            + "lbSJIXQ8wTpheeUKe47YF9JVCF8WRc1dokD7fgfn6197pwyZpDEVrVyz1pUq"
            + "jyum3ctONU4BSkAUVr9pTyeRFUeOE7SLuVu+c67PzNWXEc/HMVD4Hgs/idVc"
            + "mrONk3xe385wFJK1iPe1kfRX5OXk9UWr2/yjgrahbkonWhJHnIlvs+b5rRKN"
            + "qauwUZ+agMJV98Eyc2Lz0Lp/pNDRNjmGXeJLzAaAy46STov8sxwAgj3bQ7xu"
            + "uEzdhJPDynAY5sWd3WnBY2ZhpawnToEKnD4u+eiH2MjUL2q/R2IPSmoyg9i2"
            + "Ictgh4/ylrhm+lJDzcDrLDhC0m/t9EdhytH4erk/uCPcmAK/jpzFn6ltxcsx"
            + "QjAbBgkqhkiG9w0BCRQxDh4MAGMAbABpAGUAbgB0MCMGCSqGSIb3DQEJFTEW"
            + "BBS2wDxw7yH2OhKIgkDoQrTlavLvxQAAAAAAADCABgkqhkiG9w0BBwaggDCA"
            + "AgEAMIAGCSqGSIb3DQEHATAoBgoqhkiG9w0BDAEGMBoEFORdyeTIG2oXDQBl"
            + "I3aFNozDAkC2AgIEAKCABIIHICsc3D8rxLiDlegyXFfIejto66RW4u6b+d0C"
            + "uAAz0G+dIvhQ9g3s++vUsX7x+icO/vjpgdo09aqtIg7T3suzfcHtU8CGSgtQ"
            + "Tvml25LDC3IK3qI6cRqO+sCdvg18aS04IDKvDPYH4ca5btwPBIID6CStk/jY"
            + "QFpnSI6VNz9IERi/nwuvuBYk+A0Z7+nQdhF+QkW1rzN+uz0dkNJt6ZbG5lEK"
            + "GayV+FDTQcREMihYa716RN9sq3cm0jXXdttj998oS/QrpZDEcPqd4AM6EIL+"
            + "PTA1tEQYxXa8msAPp+tLvXOtiD6v/4FO77EA7E5oR36a9en+M1QQasFU3VBf"
            + "V9os92QlbtVUTkspJV9gXL6s4CGNptc7lUH+nIw65j9MOoyOU9w1qjPRlN/Z"
            + "MTuhFooglE6TPd29Udwufqp+hHkW/7z5tBKkhGlZEClzD3IWhcF9NVraE/IV"
            + "S5qVmx2Up7SeLZAXJ+AAznq5IXwE1dOUTkwYLcIrH1FuVA5rtOkB8Xt1LJq0"
            + "ERkjJ5MfpxTxbKXp5PejzD98v54+s4INekcrI0jzz4pLsann7ex0r6CPsQsH"
            + "+F3rBVaT3oHSKqoIm2Nw57oDjLLp5lP2qcCqps3y2dcVzu5NIzCSkVlxUaBK"
            + "IT3xv0gvVJI7wnP0QM35MCywKkToJX5ajQKrDc4iCAAzmxaQzdBycxJPYByq"
            + "VHvH7BJldJlMw5NHbTHlNoYKndMdAsHp7sUqERkDEGl80R86TlB4nJaDrfsx"
            + "vL+KluiCY9AD7o+MEYZ9VYoNDUzVGH4pTr4wnv1UFoRWix5IZuDnnYkyijKD"
            + "VtU5+mc0YtsPQIpKCBJOYt05bgpX5aPQ3s2lviYw3bvP0TrclYs/rx4wKVgW"
            + "2GYLzPh0OVMBduCbzW1E58ieBsgRyQ7+2MTl9Nj+nznjCAfLSvrVEcwxVUQA"
            + "ofcEbiECEJss2JNQq8erwgo8dP3atwQ1KeqMc8acICcOrI2rNxwVOLzPuCsl"
            + "l8gwZOoxLZXuKMQbQu4as1HNS309dfWIWppvc3K4nDWg51HUCPbsIo3wm3rR"
            + "igc/W3bf4Ppg0pLAS5c1s0Xau43u9GmIjGiDqYaasfcXnCKy2LNuUpbhoOC1"
            + "o/wMC9gT45aJQ5vsVGe5XvfhLV7Y815EdI756s9PIEOnG8HbAtCAjOIVpQfP"
            + "eF8+cnZyGGdsbmu7lYzg3whCpZ/L2RrTI86nEn5eePs4m2hDV0Oi9r6e2CIf"
            + "nGUa0TB9jf1OMhOSBD+h4jx7b6uT+XLmG8qUxvkoItMDZLrJ0f8czO5MyOZa"
            + "nEJoG42Fy2p7zD/qO72OUQISNmt8C1rQFsg9dBDib4DMu69vBsVrIV028sal"
            + "+tq1UH3vFMbEYyVfPH3WDgxyHwUQK2qrz3WBdD/BMyuAV4DPI3SPTweROh8n"
            + "yWJN1ppY9qybmTyHFCs6TRjPB9cVcdKSc0qYxgzblJiXXb3s9ANOb89aA3Ah"
            + "anWnAhcEggLZN2yFCtrRuvJXvDQhj8qmye9UkjB2fEpWXV7H0natE3hSoB+C"
            + "2krt3eBV0xJ1tLEco7T4zsbQQJRmeu/essOsfwpRfE5ZPoIeThf+UmWTsfsw"
            + "r4fxeePMTy6iCnkF5/ro8k5WKnOsaV+HWy/ulwW2r/DMT3aDBWfHX5Hk8DpU"
            + "+PlQhbyGTSTIJ/OFmbcWjMPt469o7+KrrF9IBrzJ42KzMw6xtKwtVb0232AM"
            + "pIwnLzCHIiNO2qDBZAIDdF68+GU3RsEkHfR6d5myZVxnH4mhSCFFtHxgqTOz"
            + "Ouo/uvgu72miZ0OFAy1zcMtfGMS3Md54MJkhSZq4ZgUo/EyJCeEDLGn8pMF1"
            + "jX1WsUj96qMRyc+p2KnKs6ZL95BVa76SdIFz6ts6uoIem3drTXYJHNbw29OW"
            + "Y0am+FmXTWFZFnin8Qu5Xct5l7FYIGA9VLOHL9Vtp+SXomcFEZpjMaxvtf4R"
            + "xoAI2Bc9Ka+MNiz35O0JXhI9/t5uOdiN6ZOJlfpEWOK7ou5lDkZuDcrHvLvQ"
            + "PocP2Yemd36xEgjFssR/tFITlhRBXHDeHwpvmXM4iiwD1wOGMqybXx/1g1m1"
            + "0UBbKqDsgSLQC7c0TaRFJjj71T74PBMiapiQgijv9WINfmTgxNUukbK3Kqp/"
            + "G3BmThoIDCB8WD1kxXBpaG62dSsih7yhPQJVEV3Y0tdkdChOk+Y3Wf8crV/Q"
            + "P08pQH7H9yCi04S5fSJtIDtYARWhr1yl8EQMnu2X8J6r/DWcDmXUK4Bv1vqe"
            + "tcnT5EAYFPeOMz21nonM3kJgUMNsxCQjKaEMEcUu8ZRnGUAFdG4lULPJn5NQ"
            + "LTvWg8Y3GrHRLjpnd9k+8gWWzRIbBiwCwEbClMZffRd6kcA5ZoOhVngdyvvj"
            + "BhkgadB5jC+ZRzExHxoEhzPJx3mxIVTqLuw7QxHz9OTcysvY/cGKCvmgzgk/"
            + "TjTJsqcEAAAAAAAAAAAAAAAAAAAAAAAAMD0wITAJBgUrDgMCGgUABBQWfGA6"
            + "lI+TXQiuXaa1V+LlHodhXAQUAwMIAAUvBYY+a7sXNlQeVEPAGkMCAgQAAAA=");
}
