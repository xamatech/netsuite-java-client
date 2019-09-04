# Netuite Java Client

Netsuite Java client for SOAP API [v2019.1](https://webservices.netsuite.com/wsdl/v2019_1_0/netsuite.wsdl).

As required by Netsuite, the client is generated with [Apache Axis 1.4](https://axis.apache.org/axis/)
together with the `Netsuite Axis Patch`.

## Generate new client version

The `Apache Ant` file (`build.xml`) is created according to the
instructions from the Netsuite Help Center. You only need to change
the WDSL URL in `axis-wsdl2java` task and execute

```bash
ant generate.interfaces
```


## See also

- [SUITETALK - Sample Applications](https://www.netsuite.com/portal/developers/resources/suitetalk-sample-applications.shtml)
- [SUITETALK - SOAP Web Services WSDL](https://www.netsuite.com/portal/developers/resources/suitetalk-documentation.shtml)
- [NetSuite Help Center - Building an Application with Java using Apache Axis](https://your-account-id.app.netsuite.com/app/help/helpcenter.nl?fid=section_N3420833.html)
- [Axis Ant Task](https://axis.apache.org/axis/java/ant/ant.html)
