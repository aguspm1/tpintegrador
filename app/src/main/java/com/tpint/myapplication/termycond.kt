package com.tpint.myapplication
import android.content.Context
import android.os.Bundle
import android.widget.Button
import android.widget.RadioGroup
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class termycond:AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.terminosycond)

        val tvTyC = findViewById<TextView>(R.id.tvTyC)
        val rgTyC = findViewById<RadioGroup>(R.id.rgTyC)

        val sharedPreferences = getSharedPreferences("Inversiones", Context.MODE_PRIVATE)

        tvTyC.text = "El Servicio y la relación del Usuario con la Entidad Financiera\n" +
                "\n" +
                "El Sitio y su Administrador se reservan el derecho de rechazar o cancelar cualquier solicitud de registro sin que esté obligado a comunicar o exponer las razones de su decisión y sin que ello genere algún derecho a indemnización o resarcimiento.\n" +
                "\n" +
                "El Usuario acepta y reconoce que el Sitio (o su Administrador) no es parte contratante u obligada de modo alguno, en cualquier tipo de relación que pueda surgir entre el Usuario y la(s) Entidades Financiera(s). El Sitio (o su Administrador) no tiene ninguna responsabilidad respecto de dichas relaciones.\n" +
                "\n" +
                "Una vez registrado el Usuario, no podrá cancelar la operación, por lo que el Sitio cederá sus datos personales a una o más Entidades Financieras. Sin perjuicio de ello, el Usuario podrá negarse a acordar un negocio con la Entidad Financiera que lo contacte. Además de poder solicitar la eliminación de sus datos de la base de datos del Administrador.\n" +
                "\n" +
                "La cesión de los datos del Usuario a la Entidad Financiera supone que la Entidad Financiera podrá contactar al Usuario a los efectos de: (i) solicitar más información a los efectos de decidir si aprueba o no el otorgamiento del producto financiero solicitado; (ii) l comunicar el otorgamiento y condiciones y términos del producto financiero solicitado o su denegación y/o (iii) realizar cualquier otra consulta o comentario vinculado con el otorgamiento del producto financiero solicitado.\n" +
                "\n" +
                "Marco impositivo\n" +
                "\n" +
                "Todos los impuestos que correspondan al crédito finalmente obtenido se regirán por la normativa vigente y serán aplicados al Usuario conforme la misma.\n" +
                "\n" +
                "Base de datos\n" +
                "\n" +
                "El Usuario consiente y autoriza que los datos personales proporcionados sean incorporados a la base de datos propiedad de Vitamina Financiera S.A.S. con la finalidad de que éste le ofrezca los productos y/o servicios de diversos clientes que se publiciten en este sitio web así como que se realicen pre evaluaciones de su perfil comercial y crediticio.\n" +
                "\n" +
                "El Usuario tiene conocimiento y presta su formal consentimiento para que el Administrador, a fin de brindar un mejor análisis de su solicitud, pueda utilizar bases de datos de terceros que ayuden a establecer el mejor perfil crediticio. Todo ello en los términos del artículo 26 de la ley 25.326.-\n" +
                "\n" +
                "ASIMISMO, EL USUARIO PRESTA SU CONSENTIMIENTO RESPECTO DE QUE EL ADMINISTRADOR PODRÁ UTILIZAR LOS DATOS APORTADOS POR EL USUARIO PARA ENVIAR INFORMACIÓN Y/O PROMOCIONES Y/O PUBLICIDAD ASOCIADA AL SITIO Y SUS SERVICIOS. LAS NOTIFICACIONES MENCIONADAS PODRÁN SER ENVIADAS AL USUARIO A TRAVÉS DE CORREO ELECTRÓNICO Y MENSAJERÍA DE TEXTO (SMS).\n" +
                "\n" +
                "En todos los casos el Usuario autoriza expresamente la utilización de su información personal para llevar a cabo estudios internos sobre los intereses, comportamientos y demografía de los Usuarios en general, de modo de que el Sitio cuente con información que le permita mejorar el Sitio y sus servicios.\n" +
                "\n" +
                "Con este exclusivo propósito el Usuario autoriza a mantener los datos libremente proporcionados luego que los mismos fueran cedidos a una o más entidades financieras.\n" +
                "\n" +
                "En todos los casos el titular de los datos personales tiene la facultad de ejercer el derecho de acceso a los mismos en forma gratuita a intervalos no inferiores a seis meses, salvo que se acredite un interés legítimo al efecto conforme lo establecido en el artículo 14, inciso 3 de la Ley No 25.326.\n" +
                "\n" +
                "La DIRECCIÓN NACIONAL DE PROTECCIÓN DE DATOS PERSONALES, Órgano de Control de la Ley No 25.326, tiene la atribución de atender las denuncias y reclamos que se interpongan con relación al incumplimiento de las normas sobre protección de datos personales.-\n" +
                "\n" +
                "Seguridad\n" +
                "\n" +
                "El Sitio cumple con la normativa aplicable sobre seguridad de la información personal. El Sitio protege los datos personales de los Usuarios y demás información reservada y confidencial mediante el uso de cortafuegos (“firewalls”) y Secure Socket Layers (“SSL”). Sin perjuicio de ello, en la medida que no es posible asegurar en un 100% la seguridad de los Usuarios así como cualquier dato en general, en virtud de los distintos ataques e imprevisiones técnicas que se pueden suscitar, el Sitio no se responsabiliza por cualquier ataque cibernético, intercepción ilegal de datos o violación a sus bases de datos ni por los daños que pudieren ocasionar dichas circunstancias.\n" +
                "\n" +
                "Exoneración de responsabilidad\n" +
                "\n" +
                "EL USUARIO EXONERA DE RESPONSABILIDAD AL SITIO y su Administrador por cualquier daño, perjuicio o pérdida al Usuario o terceros causados por fallas en el sistema, en el servidor o en Internet. EL USUARIO TAMBIÉN EXONERA DE RESPONSABILIDAD AL SITIO Y SU ADMINISTRADOR por cualquier virus que pudiera infectar el equipo del Usuario como consecuencia del acceso, uso o examen de su sitio web o a raíz de cualquier transferencia de datos, archivos, imágenes, textos, o audio contenidos en el mismo, cuando ello no sea imputable a dolo o culpa del Sitio o su Administrador. EN VIRTUD DE LO ANTERIOR, EL SITIO Y SU ADMINISTRADOR NO SERÁ RESPONSABLE FRENTE AL USUARIO POR LOS RIESGOS Y DAÑOS REFERIDOS EN EL PRESENTE PÁRRAFO.\n" +
                "\n" +
                "Los Usuarios NO podrán imputarle responsabilidad alguna ni exigir pago por lucro cesante, en virtud de perjuicios resultantes de dificultades técnicas o fallas en los sistemas o en Internet. No se garantiza el acceso y uso continuado o ininterrumpido del Sitio, pudiendo el sistema eventualmente no estar disponible debido a dificultades técnicas o fallas de Internet, o por cualquier otra circunstancia ajena al Sitio; en tales casos se procurará restablecerlo con la mayor celeridad posible sin que por ello pueda imputársele algún tipo de responsabilidad. El Sitio y o el Administrador no serán responsables por ningún error u omisión contenidos en su Sitio web, salvo que se imputable a dolo de Sitio o su Administrador.\n" +
                "\n" +
                "Se informa a los Usuarios que el Sitio podrá dar de baja en cualquier momento sin expresión de causa, tanto su servicio como los datos que hubieran sido cedidos al Sitio.\n" +
                "\n" +
                "Propiedad Intelectual\n" +
                "\n" +
                "La marca del Sitio, los contenidos de las pantallas, la página web del Sitio, como así también los programas, bases de datos, redes, archivos que permiten al Usuario acceder y usar la cuenta asociada a su registro están protegidas por las leyes y los tratados internacionales de derecho de autor, marcas, patentes, modelos y diseños industriales. El uso indebido y la reproducción total o parcial de dichos contenidos quedan prohibidos, salvo autorización expresa y por escrito de su propietario.\n" +
                "\n" +
                "Sin perjuicio de lo anterior, ninguna persona está autorizada a copiar, modificar, comercializar ni utilizar de ningún otro modo, total o parcialmente, el software o los servicios del Sitio, salvo por del modo expresamente previsto en los Términos y Condiciones.\n" +
                "\n" +
                "Enlaces\n" +
                "\n" +
                "La eventual presencia de enlaces a otros sitios web no implica una sociedad, relación, aprobación, respaldo del Sitio a dichos sitios ni sus contenidos.\n" +
                "\n" +
                "Anuncios y Cookies\n" +
                "\n" +
                "Determinados proveedores terceros, incluido Google, utilizan cookies para mostrar anuncios en función de las visitas anteriores del usuario a su sitio web. Los Usuarios pueden inhabilitar el uso de cookies por parte de Google a través de la página de inhabilitación de publicidad de Google. También puede indicar a los Usuarios que inhabiliten el uso de cookies por parte de un proveedor tercero a través de la página de inhabilitación de la Network Advertising Initiative o Iniciativa publicitaria en la red.\n" +
                "\n" +
                "Indemnidad\n" +
                "\n" +
                "El Usuario indemnizará y mantendrá indemne al Sitio, su Administrador y sus directivos, gerentes, representantes y empleados, por cualquier reclamo o demanda de otros Usuarios o terceros por sus actividades en el Sitio o por su incumplimiento los Términos y Condiciones y demás políticas que se entienden incorporadas al presente o por la violación de cualesquiera leyes o derechos de terceros, incluyendo los honorarios de abogados en una cantidad razonable.\n" +
                "\n" +
                "Modificación de Términos y Condiciones\n" +
                "\n" +
                "Los Términos y Condiciones pueden ser modificados en cualquier momento, en cuyo caso se publicarán los nuevos Términos y Condiciones en el Sitio. Todos los términos modificados entrarán en vigor inmediatamente a su publicación por lo que es obligación de los Usuario informarse de los Términos y Condiciones cada vez que accedan al Sitio\n" +
                "\n" +
                "Domicilio Constituido\n" +
                "\n" +
                "Se fija como domicilio a todos los efectos legales en Avenida Corrientes 531 piso 6, de la Ciudad Autónoma de Buenos Aires, República Argentina y el Usuario constituye domicilio en el indicado en los datos personales de la página web.\n" +
                "\n" +
                "¿Qué pasa si no acepto los presentes términos y condiciones?\n" +
                "\n" +
                "Para poder utilizarse el presente sitio, te informamos sobre el servicio que brindamos y que hacemos con tus datos. En caso de que no estés de acuerdo con las reglas que te explicamos, deberías abandonar nuestro sitio y seguir tu búsqueda en algún otro sitio o por otro medio."


        rgTyC.setOnCheckedChangeListener { group, checkedId ->
            when (checkedId) {
                R.id.rbNoaceptar -> {
                    sharedPreferences.edit().putBoolean("YaAcepto", false).apply()
                    Toast.makeText(this,"Debes aceptar para continuar", Toast.LENGTH_SHORT).show()
                }
                R.id.rbATyC -> {
                    sharedPreferences.edit().putBoolean("YaAcepto", true).apply()
                    finish()
                }
            }
        }
    }
}