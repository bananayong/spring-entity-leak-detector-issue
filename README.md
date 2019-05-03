# spring-entity-leak-detector-issue

## Reproduce issue
`mvn check`

I got messages
```
     [java] The following errors occurred during analysis:
     [java]   Exception analyzing banana.yong.web.RemoteClient using detector com.h3xstream.findsecbugs.spring.SpringEntityLeakDetector
     [java]     java.lang.NullPointerException
     [java]       At com.h3xstream.findsecbugs.spring.SpringEntityLeakDetector.analyzeMethod(SpringEntityLeakDetector.java:107)
     [java]       At com.h3xstream.findsecbugs.spring.SpringEntityLeakDetector.visitClassContext(SpringEntityLeakDetector.java:68)
     [java]       At edu.umd.cs.findbugs.DetectorToDetector2Adapter.visitClass(DetectorToDetector2Adapter.java:76)
     [java]       At edu.umd.cs.findbugs.FindBugs2.analyzeApplication(FindBugs2.java:1080)
     [java]       At edu.umd.cs.findbugs.FindBugs2.execute(FindBugs2.java:281)
     [java]       At edu.umd.cs.findbugs.FindBugs.runMain(FindBugs.java:401)
     [java]       At edu.umd.cs.findbugs.FindBugs2.main(FindBugs2.java:1185)
```
