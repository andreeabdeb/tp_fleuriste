/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 *
 * @author 0924345
 */
public class UtilDB {

    private UtilDB() {
    }

    public static Connection getConnection(String nomFichierProp)
            throws IOException, ClassNotFoundException, SQLException {
        Properties props = new Properties();
        URL urlFichierProp = UtilDB.class.getResource(nomFichierProp);
        BufferedInputStream bis = null;
        try {
          
            bis = new BufferedInputStream(urlFichierProp.openStream());
            props.load(bis);
            String driver = props.getProperty("driver");
            String url = props.getProperty("url");
            String identifiant = props.getProperty("identifiant");
            String motdepasse = props.getProperty("motdepasse");

            Class.forName(driver);
          
            return DriverManager.getConnection(url, identifiant, motdepasse);
        } finally {
            if (bis != null) {
                bis.close();
            }
        }

    }
}
