# Generated by Django 5.0.3 on 2024-03-20 12:48

from django.db import migrations, models


class Migration(migrations.Migration):

    dependencies = [
        ("produtos", "0002_produtos_peso_produtos_tipo_alter_produtos_tensao"),
    ]

    operations = [
        migrations.AlterField(
            model_name="produtos",
            name="peso",
            field=models.DecimalField(decimal_places=2, max_digits=8, null=True),
        ),
    ]
