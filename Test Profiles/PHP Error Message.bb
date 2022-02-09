[{"Name":"PHP Error Message","Enabled":true,"Scanner":2,"Author":"dviernes","UrlEncode":false,"Grep":["true,Or,(Warning|Notice|Parse|Fatal)\\serror.*\\.php\\son\\sline\\s[0-9]+"],"Tags":["All"],"PayloadResponse":false,"NotResponse":false,"isTime":false,"iscontentLength":false,"CaseSensitive":false,"ExcludeHTTP":false,"OnlyHTTP":false,"IsContentType":false,"ContentType":"","NegativeCT":false,"IsResponseCode":false,"ResponseCode":"","NegativeRC":false,"isurlextension":false,"NegativeUrlExtension":false,"MatchType":2,"RedirType":0,"MaxRedir":0,"payloadPosition":0,"grepsFile":"","IssueName":"PHP Error Message","IssueSeverity":"Low","IssueConfidence":"Certain","IssueDetail":"A server error message was detected. Certain conditions, such as an application failure, will cause a server error message to be displayed. While error messages in and of themselves are not dangerous, per se, it is what an attacker can glean from them that might cause eventual problems. Recommendations include designing and adding consistent error handling mechanisms which are capable of handling any user input to your web application, providing meaningful detail to end-users, and preventing error messages that might provide information useful to an attacker from being displayed.","RemediationDetail":"","IssueBackground":"","RemediationBackground":"","VariationAttributes":[],"InsertionPointType":[],"Scantype":0,"pathDiscovery":false}]