package br.ufscar.dc.compiladores.verso;

public class HtmlCodeGenerator {
  public static String getHtmlHeaderWithStyles() {
    return """
                <head>
            <style>
                section {
                    padding: 20px;
                    background-color: #f0f0f0;
                    border: 1px solid #ccc;
                    margin-bottom: 20px;
                }

                header, footer {
                    background-color: #333;
                    color: white;
                    text-align: center;
                    padding: 10px 0;
                }

                p {
                    font-size: 16px;
                    color: #555;
                    line-height: 1.6;
                }

                img {
                    max-width: 100%;
                    height: auto;
                    display: block;
                    margin: 0 auto;
                }

                a {
                    color: #3498db;
                    text-decoration: none;
                }

                a:hover {
                    text-decoration: underline;
                }
            </style>
        </head>
                """;

  }
}
